/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CMCookie;

<<<<<<< HEAD
import GCdao.CustomerDAO;
=======
import dao.CustomerDAO;
>>>>>>> 1a36827f8e868865cf4d29c7c69ffe6e00c99639
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

<<<<<<< HEAD
=======
/**
 *
 * @author Dang
 */
>>>>>>> 1a36827f8e868865cf4d29c7c69ffe6e00c99639
public class CMCookie {

    public static boolean isCustomerLogIn(HttpServletRequest request, HttpServletResponse response) {
        CustomerDAO c = new CustomerDAO();
        Cookie[] cookies = request.getCookies();
        String phone = "";
        if (cookies == null) {
            return false;
        }
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("phone")) {
                phone = cookie.getValue();
                String name = c.searchByPhone(phone).getName();
                request.setAttribute("name", name);
                return true;
            }
        }

        return false;
    }

    public static String getCustomerPhone(HttpServletRequest request, HttpServletResponse response) {
        CustomerDAO c = new CustomerDAO();
        Cookie[] cookies = request.getCookies();
        String phone = "";
        if (cookies == null) {
            return null;
        }
        for (Cookie cookie : cookies) {
            if (cookie.getName().equals("phone")) {
                phone = cookie.getValue();

                return phone;
            }
        }

        return null;
    }
}
