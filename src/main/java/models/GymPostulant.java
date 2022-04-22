package models;

import Enums.PaymentMethod;
import Enums.PaymentPlan;

import java.time.LocalDate;

public class GymPostulant extends Person {
public PaymentPlan paymentPlan = PaymentPlan.B;
public PaymentMethod paymentMethod = PaymentMethod.C;

    public void setPaymentPlan(PaymentPlan paymentPlan) {
        this.paymentPlan = paymentPlan;
    }

    public PaymentPlan getPaymentPlan() {
        return paymentPlan;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public GymPostulant(String name, LocalDate birth, int identification,
                        double height, int weight,
                        PaymentPlan paymentPlan,
                        PaymentMethod paymentMethodhod)
    { super(name, birth, identification, height, weight);}

    @Override
    public void showPersonInfo(){
        System.out.printf("Nombre postulante: %s%n", this.getName());
        System.out.printf("Fecha de nacimiento: %s%n",this.getBirth());
        System.out.printf("DNI: %s%n", this.getIdentification());
        System.out.printf("Altura:%s%n", this.getHeight());
        System.out.printf("Peso: %s%n", this.getWeight());
        System.out.printf("Plan de pago: %s%n", this.getPaymentPlan().getDesc());
        System.out.printf("Método de pago: %s%n", this.getPaymentMethod().getDesc());
    }

}



