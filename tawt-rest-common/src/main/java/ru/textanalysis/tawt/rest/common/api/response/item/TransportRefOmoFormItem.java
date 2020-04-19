package ru.textanalysis.tawt.rest.common.api.response.item;

import ru.textanalysis.tawt.ms.internal.TypeForms;

import java.io.Serializable;

public class TransportRefOmoFormItem implements Serializable {
/*    Form form;

    public Form getForm() {
        return form;
    }

    public void setForm(Form form) {
        this.form = form;
    }*/
    private Integer initialFormKey;
    private String initialFormString;
    private Byte typeOfSpeech;
    private Long morfCharacteristics;
    private Integer formKeyInBD;
    private TypeForms typeForm;
    private Boolean isInitialForm;

    public Boolean isInitialForm() {
        return isInitialForm;
    }

    public void setInitialForm(Boolean initialForm) {
        isInitialForm = initialForm;
    }

    public TypeForms getTypeForm() {
        return typeForm;
    }

    public void setTypeForm(TypeForms typeForm) {
        this.typeForm = typeForm;
    }

    public Integer getFormKeyInBD() {
        return formKeyInBD;
    }

    public void setFormKeyInBD(Integer formKeyInBD) {
        this.formKeyInBD = formKeyInBD;
    }

    public int getInitialFormKey() {
        return initialFormKey;
    }

    public void setInitialFormKey(Integer initialFormKey) {
        this.initialFormKey = initialFormKey;
    }

    public String getInitialFormString() {
        return initialFormString;
    }

    public void setInitialFormString(String initialFormString) {
        this.initialFormString = initialFormString;
    }

    public Byte getTypeOfSpeech() {
        return typeOfSpeech;
    }

    public void setTypeOfSpeech(Byte typeOfSpeech) {
        this.typeOfSpeech = typeOfSpeech;
    }

    public Long getMorfCharacteristics() {
        return morfCharacteristics;
    }

    public void setMorfCharacteristics(Long morfCharacteristics) {
        this.morfCharacteristics = morfCharacteristics;
    }


}
