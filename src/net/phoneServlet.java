package net;

import net.been.Phone;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "phoneServlet", urlPatterns = "/phoneList")
public class phoneServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Phone phone = new Phone();
        phone.setName("iphone X");
        phone.setId(001);
        phone.setPrice("1200");
        phone.setImage("https://img12.360buyimg.com/n7/jfs/t28021/313/1213312898/606385/7b299e8e/5cd939a2Nf0a37fae.png");

        Phone phone1 = new Phone();
        phone1.setName("iphone X1");
        phone1.setId(001);
        phone1.setPrice("1300");
        phone1.setImage("https://img12.360buyimg.com/n7/jfs/t28021/313/1213312898/606385/7b299e8e/5cd939a2Nf0a37fae.png");

        Phone phone2 = new Phone();
        phone2.setName("iphone X2");
        phone2.setId(001);
        phone2.setPrice("1400");
        phone2.setImage("https://img12.360buyimg.com/n7/jfs/t28021/313/1213312898/606385/7b299e8e/5cd939a2Nf0a37fae.png");

        Phone phone3 = new Phone();
        phone3.setName("iphone X3");
        phone3.setId(001);
        phone3.setPrice("1500");
        phone3.setImage("https://img12.360buyimg.com/n7/jfs/t28021/313/1213312898/606385/7b299e8e/5cd939a2Nf0a37fae.png");

        Phone phone4 = new Phone();
        phone4.setName("iphone X4");
        phone4.setId(001);
        phone4.setPrice("1600");
        phone4.setImage("https://img12.360buyimg.com/n7/jfs/t28021/313/1213312898/606385/7b299e8e/5cd939a2Nf0a37fae.png");

        Phone phone5 = new Phone();
        phone5.setName("iphone X5");
        phone5.setId(001);
        phone5.setPrice("1700");
        phone5.setImage("https://img12.360buyimg.com/n7/jfs/t28021/313/1213312898/606385/7b299e8e/5cd939a2Nf0a37fae.png");

        List<Phone> list = new ArrayList<>();
        list.add(phone);
        list.add(phone1);
        list.add(phone2);
        list.add(phone3);
        list.add(phone4);
        list.add(phone5);

        request.setAttribute("list", list);
        request.getRequestDispatcher("/phone_list.jsp").forward(request, response);

    }
}
