package br.com.phricardo.schedulingtechnicians.util;

import java.util.Random;

public class TechnicianRegistrationUtil {

    public static Integer generate() {
      return 10000 + new Random().nextInt(90000);
    }
}