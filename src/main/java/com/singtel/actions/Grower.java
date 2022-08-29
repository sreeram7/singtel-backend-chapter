package com.singtel.actions;

import com.singtel.model.Animal;

public interface  Grower<T extends Animal> {
    public T grow() throws Exception;
}
