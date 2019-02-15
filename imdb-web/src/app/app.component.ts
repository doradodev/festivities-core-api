import { Component } from '@angular/core';
import {DataService} from "./services/data.service";
import {Movies} from "./models/movies.model";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  movies;
  moviesCharacter;

  constructor(private dataService: DataService){}

  genres = [

    {value:'Action'},
    {value:'Adventure'},
    {value:'Animation'},
    {value:'Biography'},
    {value:'Comedy'},
    {value:'Crime'},
    {value:'Documentary'},
    {value:'Drama'},
    {value:'Family'},
    {value:'Fantasy'},
    {value:'Film Noir'},
    {value:'History'},
    {value:'Horror'},
    {value:'Music'},
    {value:'Musical'},
    {value:'Mystery'},
    {value:'Romance'},
    {value:'Sci-Fi'},
    {value:'Short'},
    {value:'Sport'},
    {value:'Superhero'},
    {value:'Thriller'},
    {value:'War'},
    {value:'Western'}
  ];

  title = 'app';

  goSearch(selectedGenre){

    const genre = {
      genre:'%'+selectedGenre+'%'
    }
    this.dataService.getRatings(genre).subscribe(movies =>{
        this.movies = movies;
    });
  }

  goSearchCharacter(selectedMovie){
    if(selectedMovie === ''){

    }else {

      const movie = {
        title:'%'+selectedMovie+'%'
      }
      this.dataService.getMovies(movie).subscribe(movies =>{
        this.moviesCharacter = movies;
      });
    }
  }
}
