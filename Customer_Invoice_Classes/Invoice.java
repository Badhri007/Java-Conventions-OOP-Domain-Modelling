public class Invoice {
   private int id;
   private Customer customer;
   private double amount;
   
   
   public Invoice(int id,Customer customer,double amount)
   {
        this.id=id;
        this.customer=customer;
        this.amount=amount;
   }

   public int getId()
   {
        return id;
   }

   public Customer getCustomer()
   {
        return customer;
   }

   public void setCustomer(Customer newCustomer)
   {
        this.customer=newCustomer;
   }

   public double getAmount()
   {
        return amount;
   }

   public void setAmount(double newAmount)
   {
        this.amount=newAmount;
   }

   public int getCustomerId()
   {
        return customer.getId();
   }

   public String getCustomerName()
   {
        return customer.getName();
   }

   public int getCustomerDiscount()
   {
        return customer.getDiscount();
   }

   public double getAmountAfterDiscount()
   {
        int discount=customer.getDiscount();
        double reducedAmount=amount-((amount*discount)/100);
        return reducedAmount;
   }

   public String toString()
   {
        return "Invoice[ id=" + id + "," + "customer= " + customer.getName() + ", " +  customer.getId() + ", "  + customer.getDiscount() + "% " + ", amount= "+amount + " ]"; 
   }
}
