/*
 * @ (#) $(NAME).java   1.0 31/08/2024
 * Copyright (c) $YEAR.IUH All right reserved.
 */

package iuh.fit.se;

/*
 *@description:  This class represents a bank with many bank accounts
 *@author: Ngo Khuong Duy
 *@version: 1.0
 *@created: 31/08/2024
 */
// Lớp TestRectangle
public class TestRectangle {
    public static void main(String[] args) {
        // Tạo đối tượng Rectangle
        Rectangle rect = new Rectangle(9, 3);

        // In ra giá trị chu vi và diện tích
        System.out.println("Chu vi: " + rect.getPerimeter());
        System.out.println("Dien tich: " + rect.getArea());

        // Thử set giá trị mới cho length và width
        rect.setLength(10);
        rect.setWidth(7);

        // In ra các giá trị sau khi set lại
        System.out.println("Chu vi moi: " + rect.getPerimeter());
        System.out.println("Dien tich moi: " + rect.getArea());

        // In ra biểu diễn dạng chuỗi của hình chữ nhật
        System.out.println(rect.toString());
    }
}