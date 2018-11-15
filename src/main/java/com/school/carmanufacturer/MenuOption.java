package com.school.carmanufacturer;

public abstract class MenuOption {
    private String option;

    public MenuOption(String _option){
        option = _option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public String getOption() {
        return option;
    }

    public abstract void doAction();
}
