package com.invoice;

class Invoicee{
	String partNo;
	String partDes;
	int quantity;
	double pricePerItem;
	
	public Invoicee(String partNo,String partDes,int quantity, double pricePerItem ) {
		this.partNo = partNo;
		this.partDes = partDes;
		this.quantity = quantity;
		this.pricePerItem = pricePerItem;
	}
	public void setPartNo(String partNo) {
        this.partNo = partNo;
    }

    public void setPartDes(String partDes) {
        this.partDes = partDes;
    }

    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 0;
        }
    }

    public void setPricePerItem(double pricePerItem) {
        if (pricePerItem > 0) {
            this.pricePerItem = pricePerItem;
        } else {
            this.pricePerItem = 0;
        }
    }
	 public String getPartNo() {
	        return partNo;
	    }

	    public String getPartDes() {
	        return partDes;
	    }

	    public int getQuantity() {
	        return quantity;
	    }

	    public double getPricePerItem() {
	        return pricePerItem;
	    }
	    
	    
	    
	    public double getInvoiceAmount() {
	        return quantity * pricePerItem;
	    }
}

 class InvoiceTest {
    public void runTests() {

        Invoicee invoice = new Invoicee("A123", "ScrewDriver", 10, 250);


        System.out.println("Part Number: " + invoice.getPartNo());
        System.out.println("Description: " + invoice.getPartDes());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price per Item: " + invoice.getPricePerItem());
        System.out.println("Total Invoice Amount: " + invoice.getInvoiceAmount());

  
        invoice.setQuantity(-5);
        invoice.setPricePerItem(-100.0);

        System.out.println("\nAfter setting invalid values:");
        System.out.println("Quantity: " + invoice.getQuantity()); 
        System.out.println("Price per Item: " + invoice.getPricePerItem()); 
        System.out.println("Total Invoice Amount: " + invoice.getInvoiceAmount());
  }
}

public class Invoice {

	public static void main(String[] args) {
		  InvoiceTest test = new InvoiceTest();
	        test.runTests();

	}

}