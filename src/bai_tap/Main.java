package bai_tap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ProductManager productManager = new ProductManager();
        boolean isRun = true;

        while (isRun) {
            System.out.println("+----------------------------------------------+");
            System.out.println("| 1.Thêm sản phẩm :                            |");
            System.out.println("| 2.Sửa thông tin sản phẩm theo id :           |");
            System.out.println("| 3.Xoá sản phẩm theo id :                     |");
            System.out.println("| 4.Hiển thị danh sách sản phẩm :              |");
            System.out.println("| 5.Tìm kiếm sản phẩm theo tên :               |");
            System.out.println("| 6.Sắp xếp sản phẩm tăng dần :                |");
            System.out.println("| 7. Sắp xếp giảm dần theo giá :               | ");
            System.out.println("| 0.Exit :                                     |");
            System.out.println("+----------------------------------------------+");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Nhập id của sản phẩm : ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Nhập Tên sản phẩm :  ");
                    String name = sc.nextLine();

                    System.out.println("Nhập giá của sản phẩm : ");
                    double price = sc.nextDouble();

                    Product p = new Product(name, id, price);
                    productManager.add(p);
                    System.out.println("Thêm sản phẩm thành công ");
                    break;
                case 2:
                    System.out.println("Nhập id của sản phẩm : ");
                    int newId = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Nhập Tên sản phẩm :  ");
                    String newName = sc.nextLine();

                    System.out.println("Nhập giá của sản phẩm : ");
                    double newPrice = sc.nextDouble();

                    Product newP = new Product(newName, newId, newPrice);
                    productManager.edit(newId, newP);
                    System.out.println("Sửa sản phẩm thành công ");
                    break;
                case 3:
                    System.out.println("Nhập sản phẩm muốn xóa : ");
                    int deleteProduct = sc.nextInt();
                    productManager.remove(deleteProduct);
                    System.out.println("Xóa thành công ");
                    break;
                case 4:
                    System.out.println("Hiển thị danh sách : ");
                    productManager.displayProduct();
                    break;
                case 5:
                    System.out.println("Sản Phẩm muốn tìm kiếm : ");
                    String keyWord = sc.next();
                    productManager.search(keyWord);
                    System.out.println("Sản phẩm bạn muốn tìm : " + keyWord);
                    break;
                case 6:
                    productManager.increaseInValue();
                    productManager.displayProduct();
                    System.out.println("Giá trị tăng dần " );
                    break;
                case 7:
                    productManager.reduceValue();
                    productManager.displayProduct();
                    System.out.println("Giá trị giảm dần ");
                    break;
                case 0:
                    isRun = false;
                    break;
                default:
                    System.out.println("Vui lòng nhập lại : ");
                    break;

            }

        }


    }
}
