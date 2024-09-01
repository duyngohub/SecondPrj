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
public class Rectangle {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        if (length < 0 || width < 0) {
            throw new IllegalArgumentException("Length and width must be greater than 0.");
        }
        this.length = length;
        this.width = width;
    }

    // Phương thức tính diện tích
    public double getArea() {
        return length * width;
    }

    // Phương thức tính chu vi
    public double getPerimeter() {
        return 2 * (length + width);
    }

    // Getters
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    // Setters với ràng buộc
    public void setLength(double newLength) {
        if (newLength < 0) {
            throw new IllegalArgumentException("Length must be greater than 0");
        }
        this.length = newLength;
    }

    public void setWidth(double newWidth) {
        if (newWidth < 0) {
            throw new IllegalArgumentException("Width must be greater than 0.");
        }
        this.width = newWidth;
    }

    @Override
    public String toString() {
        return "Rectangle[length=" + length + ", width=" + width + "]";
    }
}
