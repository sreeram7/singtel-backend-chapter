package com.singtel.actions;


import com.singtel.model.Insect;

public interface Metamorphic<T extends Insect> {
    public T metamorphosis() throws Exception;
}
