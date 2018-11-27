package com.school.carmanufacturer;

/**
 * abstract class MenuOption to allow doAction to attach actions to menu item
 */
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
