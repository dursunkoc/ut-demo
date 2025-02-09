package io.github.dursunkoc.mocks;

public class Service {
    private final Dependency dependency;
    private final Mapper mapper;

    public Service(Dependency dependency, Mapper mapper) {
        this.dependency = dependency;
        this.mapper = mapper;
    }

    public Data process() {
       Data data =  dependency.getData();
        return new Data("Processing - " + data.getData());
    }

    public int processAndMapResult() {
        return mapper.map(process());
    }
}
