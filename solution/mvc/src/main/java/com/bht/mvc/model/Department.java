package com.bht.mvc.model;

import java.util.UUID;
import javax.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author shiyuanchen
 * @created 2020/05/11
 * @project mvc
 */
@Component
@Data
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Department {

    @NotNull
    private String deptid;
    private String name;
    private String loc;

    public Department() {
        this.deptid = UUID.randomUUID().toString();
    }

    public Department(String name, String loc) {
        this();
        this.name = name;
        this.loc = loc;
    }
}
