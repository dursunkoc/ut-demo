package io.github.dursunkoc.mocks;

public class MapperImpl implements Mapper{
    @Override
    public int map(Data value) {
        return value==null ? 0 : value.getData().length();
    }
}
