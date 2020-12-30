public class Test2 {
    public static void main(String[] args){
        //你要购买的商品，显示商品信
        Product []products=new Product[3];//做一个购物车
        Product product=new Product();
        product.setpId("123");
        product.setpName("硬盘");
        product.setPrice("56");
        product.setpDesc("很好");
        products[0]=product;

        for (Product p : products) {
            if (p!=null)
                System.out.print(product.getpId());
                System.out.print("\t" + product.getpName());
                System.out.print("\t" + product.getPrice());
                System.out.println("\t" + product.getpDesc());
        }
    }
}

