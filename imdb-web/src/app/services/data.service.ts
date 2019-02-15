import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";


@Injectable({
  providedIn: 'root'
})
export class DataService {

  constructor(private http: HttpClient ) { }

  getRatings(genre) {
    return this.http.post('/api/imdb/findTopRating', genre);
  }

  getMovies(movie) {
    return this.http.post('/api/imdb/findMovieByTitle', movie);
  }
}
