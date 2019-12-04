package net.z.promotion;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import net.z.bean.Product;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import javax.servlet.http.HttpSessionBindingEvent;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

@WebListener()
public class promotionListener implements ServletContextListener {

    // Public constructor is required by servlet spec
    public promotionListener() {
    }

    // -------------------------------------------------------
    // ServletContextListener implementation
    // -------------------------------------------------------
    public void contextInitialized(ServletContextEvent sce) {
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {

                try {
                    ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
                    QueryRunner queryRunner = new QueryRunner(comboPooledDataSource);

                    String sql = "select * from product";
                    List<Product> query = queryRunner.query(sql, new BeanListHandler<Product>(Product.class));
                    if (query!=null && query.size()>0)
                    {
                        for (Product product : query) {
                            if (product.getC_id() ==1)
                            {
                                //数码产品
                                BigDecimal price = product.getPrice();
                                //减100元
                                BigDecimal temp = new BigDecimal(100);
                                //减法
                                price = price.subtract(temp);
                                //修改好的价格设置回去给 product
                                product.setPrice(price);
                                System.out.println(product.getName() + "现在打折只要" + price);
                            }else{
                                BigDecimal price = product.getPrice();
                                //减100元
                                BigDecimal temp = new BigDecimal(10);
                                //减法
                                price = price.subtract(temp);
                                //修改好的价格设置回去给 product
                                product.setPrice(price);
                                System.out.println(product.getName() + "现在打折只要" + price);
                            }


                        }
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }, new Date(), 1000*20);
    }

    public void contextDestroyed(ServletContextEvent sce) {
      /* This method is invoked when the Servlet Context 
         (the Web application) is undeployed or 
         Application Server shuts down.
      */
    }


}
