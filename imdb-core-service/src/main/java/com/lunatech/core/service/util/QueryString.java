package com.lunatech.core.service.util;

public final class QueryString {
    
    public static final String RATING_QUERY = "select b.primaryTitle, r.averageRating from Basic b, Rating r where b.tconst = r.tconst and b.genres like :genre order by r.averageRating desc"; 
    public static final String MOVIE_QUERY = "select b.tconst, b.primaryTitle, nb.primaryName, p.characteres from Basic b, Principal p, NameBasic nb where b.tconst = p.tconst and p.nconst = nb.nconst and b.primaryTitle like :title"; 
}
