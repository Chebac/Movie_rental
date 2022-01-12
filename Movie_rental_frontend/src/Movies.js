import React, { useEffect, useState } from "react";
import "./App1.scss";

function Movies() {
  useEffect(() => {
    fetchMovies();
  }, []);

  const [movies, setMovies] = useState([]);

  const fetchMovies = async () => {
    const data = await fetch("https://jsonplaceholder.typicode.com/posts");
    const movies = await data.json();
    console.log(data);
    setMovies(movies);
  };

  function handleClick(e) {
    e.preventDefault();
    alert("Ati inchiriat filmul");
  }

  return (
    <div className="movie-page">
      {movies.map((movie, index) => (
        <article className="card" key={index}>
          <img src="https://upload.wikimedia.org/wikipedia/commons/f/f9/Phoenicopterus_ruber_in_S%C3%A3o_Paulo_Zoo.jpg" />
          <div>Titlu Film:</div>
          <div>Descriere Film:</div>
          <div>
            <button type="button" onClick={handleClick}>
              Inchiriaza
            </button>
          </div>
        </article>
      ))}
    </div>
  );
}

export default Movies;
