package Day14Package;

public class ECommerceStores {
    public String companyName;
    public int totalCustomers;
    public ECommerceStores(String companyName, int totalCustomers){
        this.companyName = companyName;
        this.totalCustomers = totalCustomers;
    }
    public String getCompanyName(){
        return companyName;
    }
    public int getTotalCustomers(){
        return totalCustomers;
    }
    public void setCompanyName(String companyName){
        this.companyName = companyName;
    }
    public void setTotalCustomers(int totalCustomers){
        this.totalCustomers = totalCustomers;
    }
}
