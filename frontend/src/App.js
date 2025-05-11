import React, { useEffect, useState } from "react";
import axios from "axios";

function App() {
  const [mensagem, setMensagem] = useState("");

  useEffect(() => {
    axios.get("http://localhost:8080/api/teste")
      .then(response => {
        setMensagem(response.data);
      })
      .catch(error => {
        console.error("Erro ao conectar com o backend:", error);
        setMensagem("Erro ao conectar com a API.");
      });
  }, []);

  return (
    <div style={{ padding: "2rem", fontFamily: "Arial" }}>
      <h1>Frontend React</h1>
      <p><strong>Resposta da API:</strong> {mensagem}</p>
    </div>
  );
}

export default App;
