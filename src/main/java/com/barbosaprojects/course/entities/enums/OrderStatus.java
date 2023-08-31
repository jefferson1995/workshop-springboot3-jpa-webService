package com.barbosaprojects.course.entities.enums;

import org.aspectj.weaver.ast.Or;

public enum OrderStatus {

    /*
        O numero em parenteses é para fixar o valor do status - melhor manutenção
     */

    WAITING_PAYMENT(1),
    PAID(2),
    SHIPPED(3),
    DELIVERED(4),
    CANCELED(5);

    private int code;

    //Construtor de enum é privado
    private OrderStatus(int code){
        this.code = code;
    }



    //Retorna o código
    public int getCode(){
        return code;
    }

    //Verifica se o código da função é igual da orderStatus
    public static OrderStatus valueOf(int code){
        for (OrderStatus value : OrderStatus.values()){
            if(value.getCode() == code){
                return value;
            }
        }
        throw new IllegalArgumentException("Invalid OrderStatus code");
    }
}
