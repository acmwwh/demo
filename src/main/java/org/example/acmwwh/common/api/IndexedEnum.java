package org.example.acmwwh.common.api;

public interface IndexedEnum<E extends Enum<E>, T> {

    T getIndex();
}
