package edu.baylor.ecs.Panda2;

import java.util.ArrayList;

public class PaymentInfo {
	private String CarName;
	private String CarPrice;
	private String BuyerName;
	private String CreditCard;
	private String pickUpDate;
	private ArrayList<PaymentInfo> list;
	public String getCarName() {
		return CarName;
	}
	public void setCarName(String carName) {
		CarName = carName;
	}
	public String getCarPrice() {
		return CarPrice;
	}
	public void setCarPrice(String carPrice) {
		CarPrice = carPrice;
	}
	public String getBuyerName() {
		return BuyerName;
	}
	public void setBuyerName(String buyerName) {
		BuyerName = buyerName;
	}
	public String getCreditCard() {
		return CreditCard;
	}
	public void setCreditCard(String creditCard) {
		CreditCard = creditCard;
	}
	public String getPickUpDate() {
		return pickUpDate;
	}
	public void setPickUpDate(String pickUpDate) {
		this.pickUpDate = pickUpDate;
	}
	public ArrayList<PaymentInfo> getList() {
		return list;
	}
	public void setList(ArrayList<PaymentInfo> list) {
		this.list = list;
	}
	public void add(PaymentInfo info) {
		list.add(info);
	}
    public Object[][] conver2Data(){
    	Object[][] data = new Object[list.size()][5];
    	for(int i = 0; i < list.size(); i++) {
    		data[i][0] = list.get(i).getCarName();
    		data[i][1] = list.get(i).getCarPrice();
    		data[i][2] = list.get(i).getBuyerName();
    		data[i][3] = list.get(i).getCreditCard();
    		data[i][3] = list.get(i).getPickUpDate();
    	}
    	return data;
    }
	
	
	
}
