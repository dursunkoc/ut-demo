package io.github.dursunkoc.mocks;

public class Service {
    private final Dependency dependency;
    private final Mapper mapper;

    public Service(Dependency dependency, Mapper mapper) {
        this.dependency = dependency;
        this.mapper = mapper;
    }

    public String process() {
       String data =  dependency.getData();
        return "Processing - " + data;
    }

    public int processAndMapResult() {
        return mapper.map(process());
    }
}
