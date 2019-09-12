package ProductManager;

import java.util.ArrayList;

public class ProductManagerTest {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product(1,"Oto", 1.2f, "san pham 1"));
        products.add(new Product(2,"Xe may", 1.3f, "san pham 2"));
        products.add(new Product(3, "Xe dap", 1.4f, "san pham 3"));
        products.add(new Product(4, "May bay", 1.5f, "san pham 4"));

        listProduct(products);
        System.out.println("---------");
        searchProduct(products, "Xe may");
        searchProduct(products, "May bay");
        removeProduct(products, 3);
        modifyProduct(products, 0, new Product(5, "Xe Tang", 1.8f, "san pham 5"));
        addNewProduct(products, new Product(6, "Tau ngam", 2.0f, "san pham 6"));
        System.out.println("------------");
        listProduct(products);

    }
    public static void listProduct(ArrayList<Product> products){
        for (Product product : products){
            System.out.println("ProductManager.Product : " + product.getId() + " name :" + product.getName()
                    + " price : " + product.getPrice() + " description : " + product.getDescription());
        }
    }

    public static void addNewProduct(ArrayList<Product> products, Product newProducts){
        products.add(newProducts);
        System.out.println("Add new product success!");
    }

    public static void modifyProduct(ArrayList<Product> products, int index, Product modifyProduct){
        try{
            products.add(index, modifyProduct);
            products.remove(index + 1);
            System.out.println("Modified product success ! ");
        }catch (Exception e){
            System.out.println("Index is not valid!");
        }

    }

    public static void removeProduct(ArrayList<Product> products, int index){
        try{
            products.remove(index);
            System.out.println("Remove success !");
        }catch (Exception e){
            System.out.println("Index is not valid!");
        }

    }

    public static void searchProduct(ArrayList<Product> products, String name){
        boolean check = false;
        for (Product product: products){
            if (name.equals(product.getName())){
                System.out.println("ProductManager.Product : " + product.getId() + " name :" + product.getName()
                        + " price : " + product.getPrice() + " description : " + product.getDescription());
                check = true;
                break;
            }
        }
        if (!check){
            System.out.println("Not found product !");
        }
    }
}
