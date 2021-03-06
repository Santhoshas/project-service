package com.marketlogic.app.project.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.marketlogic.app.project.constants.Status;
import com.marketlogic.app.project.constants.Type;
import com.marketlogic.app.project.utils.StatusConverter;
import com.marketlogic.app.project.utils.TypeConverter;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class ProjectRecord implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String title;

    @Column
    private String description;

    @Column
    @Convert(converter = TypeConverter.class)
    private Type type;

    @Column
    @Convert(converter = StatusConverter.class)
    private Status status;

    @JsonIgnore
    @OneToMany(mappedBy = "projectRecord", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<SectionRecord> sectionRecords = new ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "project_id")
    private Project project;

}
