let fila = []; // Array para armazenar a fila

function adicionarNaFila() {
  const nomeInput = document.getElementById("nome");
  const nome = nomeInput.value.trim();

  if (nome !== "") {
    fila.push(nome); // Adiciona o nome ao final da fila
    atualizarFila();
    nomeInput.value = ""; // Limpa o input
  } else {
    alert("Por favor, insira um nome.");
  }
}

function atualizarFila() {
  const filaLista = document.getElementById("fila");
  filaLista.innerHTML = ""; // Limpa a lista atual

  for (let i = 0; i < fila.length; i++) {
    const item = document.createElement("li");
    item.textContent = fila[i];
    filaLista.appendChild(item);
  }
}