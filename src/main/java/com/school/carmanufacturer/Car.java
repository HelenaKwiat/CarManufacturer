package com.school.carmanufacturer;

public abstract class Car {
  private String model;
  private Integer price;
  //TODO implement individual cars
  public Car(String  _model){
      model = _model;
  }

  protected abstract void construct();

  protected abstract Integer getPrice();

  public void setModel(String _model){
      model = _model;
  }

//    public void setPrice(Integer price) {
//        this.price = price;
//    }
//
//    public Integer getPrice() {
//        return price;
//    }

    public String getModel(){
        return model;
    }
}
