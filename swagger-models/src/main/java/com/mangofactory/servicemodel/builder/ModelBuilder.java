package com.mangofactory.servicemodel.builder;

import com.mangofactory.servicemodel.Model;
import com.mangofactory.servicemodel.ModelProperty;

import java.util.List;
import java.util.Map;

public class ModelBuilder {
  private String id;
  private String name;
  private String qualifiedType;
  private Map<String, ModelProperty> properties;
  private String description;
  private String baseModel;
  private String discriminator;
  private List<String> subTypes;

  public ModelBuilder id(String id) {
    this.id = id;
    return this;
  }

  public ModelBuilder name(String name) {
    this.name = name;
    return this;
  }

  public ModelBuilder qualifiedType(String qualifiedType) {
    this.qualifiedType = qualifiedType;
    return this;
  }

  public ModelBuilder properties(Map<String, ModelProperty> properties) {
    this.properties = properties;
    return this;
  }

  public ModelBuilder description(String description) {
    this.description = description;
    return this;
  }

  public ModelBuilder baseModel(String baseModel) {
    this.baseModel = baseModel;
    return this;
  }

  public ModelBuilder discriminator(String discriminator) {
    this.discriminator = discriminator;
    return this;
  }

  public ModelBuilder subTypes(List<String> subTypes) {
    this.subTypes = subTypes;
    return this;
  }

  public Model build() {
    return new Model(id, name, qualifiedType, properties, description, baseModel, discriminator, subTypes);
  }
}