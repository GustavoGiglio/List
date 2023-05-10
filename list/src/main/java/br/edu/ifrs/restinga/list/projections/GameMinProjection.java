package br.edu.ifrs.restinga.list.projections;

public interface GameMinProjection {
    
    Long getId();
    String getTitle();
    Integer getYear();
    String getImgUrl();
    String getShortDescription();
    Integer getPosition();
}
