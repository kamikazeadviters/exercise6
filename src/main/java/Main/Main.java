package Main;

import Enums.PaymentMethod;
import Enums.PaymentPlan;
import Enums.Subject;
import models.GymPostulant;
import models.GymProfessor;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
			var postulante = new GymPostulant(
					"Eduardo Peduto",
					LocalDate.of(1992, 12, 22),
					35951253,
					1.95,
					95,
					PaymentPlan.B,
					PaymentMethod.C
			);
			var teacher = new GymProfessor(
					"Georgina Bardach",
					LocalDate.of(1983, 8, 18),
					23588961,
					1.71,
					75,
					150000,
					Subject.N
			);

			postulante.showPersonInfo();
			teacher.showPersonInfo();
		}

	}
