/**
 * 
 */
package ��ӿ���;


public class VIPCustomer extends Customer {
    //�������
	double saleRatio; //���η�
	private int agentID; //��� ���� ID
	
	
	//������
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
	    customerGrade = "VIP";
	    bonusRatio = 0.05; //���ʽ� ���� 5%
	    saleRatio = 0.1;//���η� 10%
	    
	    this.agentID  = agentID;
	    
	}
  //�ʿ��� �޼ҵ� ����
	public int salePrice(int price) {
		bonusPoint += price*bonusRatio;
		return price - (int)(price*saleRatio);
	}
  //agentID getter setter		
	public int getAgentID() {
		return agentID;
	}
	
	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}
	

}
