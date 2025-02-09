package io.github.dursunkoc.mocks;

public class MapperImpl implements Mapper{
    @Override
    public int map(String value) {
        return value==null ? 0 : value.length();
    }
}
