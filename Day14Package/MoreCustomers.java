package Day14Package;

public class MoreCustomers {
    public static void main(String[] args) {
        ECommerceStores amazon = new ECommerceStores("Amazon", 1000 );
        ECommerceStores shein = new ECommerceStores("Shein", 10000);
        ECommerceStores etsy = new ECommerceStores("Etsy", 2000);
        if((amazon.totalCustomers> shein.totalCustomers)&& (amazon.totalCustomers>etsy.totalCustomers))
                System.out.println("Amazon has more number of customers");
        else if((shein.totalCustomers> amazon.totalCustomers)&& (shein.totalCustomers> etsy.totalCustomers))
                System.out.println("Shein has more number of Customers");
        else
            System.out.println("Etsy has more number of Customers");
        }
    }
