package com.compan;

import java.util.Arrays;

public class Jailoo {
 private  String name;
 private String address;
 private  String nameChaban;
 private Cow[] cows;
 private Sheep[] sheep;
 private Horse[] horses;

 public Jailoo(String name, String address, String nameChaban, Cow[] cows, Sheep[] sheep, Horse[] horses) {
  this.name = name;
  this.address = address;
  this.nameChaban = nameChaban;
  this.cows = cows;
  this.sheep = sheep;
  this.horses = horses;
 }

 @Override
 public String toString() {
  return "Jailoo{" +
          "name='" + name + '\'' +
          ",\n address='" + address + '\'' +
          ",\n nameChaban='" + nameChaban + '\'' +
          ",\n cows=" + Arrays.toString(cows) +
          ",\n sheep=" + Arrays.toString(sheep) +
          ",\n horses=" + Arrays.toString(horses) +
          '}';
 }
}
