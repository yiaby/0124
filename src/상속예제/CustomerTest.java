package ��ӿ���;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customerhong = new Customer(10010, "ȫ�浿");
		customerhong.bonusPoint=1000;
        System.out.println(customerhong.showCustomerInfo());
	
	    int priceHong = customerhong.salePrice(20000);
	    System.out.println("��ǰ ���� �ݾ�: "+ priceHong);
	
	    System.out.println();
	    
	    VIPCustomer customerSon = new VIPCustomer(10020,"�����", 12345);
	    customerSon.bonusPoint = 50000;
	    System.out.println(customerSon.showCustomerInfo());
	    
	    int priceSon = customerSon.salePrice(20000);
	    System.out.println("��ǰ ���� �ݾ�: "+ priceSon);
	    
	    int agentID = customerSon.getAgentID();
	    System.out.println("VIP�� ��� ���� ID:" + agentID);
	}

}
