package com.sample;


//@Entity
public class CheckboxStatus {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
    private boolean showCheckbox;

    // Getters and Setters
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }

    public boolean isShowCheckbox() {
        return showCheckbox;
    }

    public void setShowCheckbox(boolean showCheckbox) {
        this.showCheckbox = showCheckbox;
    }
}