// src\components\ListaDeJogadores\index.js

import { useState, useEffect } from "react";
import axios from "axios";
import './styles.css'

function ListaDeJogadores()
{
    const [jogadores, setJogadores] = useState([])

    useEffect(() =>
        {
        const carregarJogadores = async () =>
            {
            try
            {
                const response = await axios.get('https://primeiro-site-rlhz.onrender.com/jogadores')
                setJogadores(response.data)
            } catch (error)
            {
                alert('Erro ao buscar usuários: ', error)
                setJogadores([])
            }
        }
        carregarJogadores()
    }, [])

    return (
        <ul id="listaUsurios" className="lista-jogadores">
            {jogadores.length === 0 ? (
                <li>Nenhum usuário encontrado.</li>
            ) : (
                jogadores.map( jogador => (
                    <li key={jogador.id}>
                        <strong>Nome: </strong> {jogador.nome}<br />
                        <strong>Sexo: </strong> {jogador.sexo}<br />
                        <strong>Idade: </strong> {jogador.idade}<br />
                        <strong>Altura: </strong> {jogador.altura}<br />
                        <strong>Peso: </strong> {jogador.peso}<br />
                        <strong>Posição: </strong> {jogador.posicao}<br />
                        <strong>Número da Camisa: </strong> {jogador.numeroCamisa}<br />  
                    </li>
                ))
            )}
        </ul>
    )
   
}

export default ListaDeJogadores