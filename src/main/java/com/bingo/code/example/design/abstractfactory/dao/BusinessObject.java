package com.bingo.code.example.design.abstractfactory.dao;

public class BusinessObject {
	public static void main(String[] args) {
		DAOFactory df = new RdbDAOFactory();
		OrderMainDAO mainDAO = df.createOrderMainDAO();
		OrderDetailDAO detailDAO = df.createOrderDetailDAO();
		mainDAO.saveOrderMain();
		detailDAO.saveOrderDetail();
	}
}
