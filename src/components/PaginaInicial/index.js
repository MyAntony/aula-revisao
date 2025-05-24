// src\components\PaginaInicial\index.js

import { useNavigate } from "react-router-dom";
import './styles.css'
import logo from '../../assets/images/logo.png'

function PaginaInicial() {
    const navigate = useNavigate()

    return (
        <div className='pagina-inicial'>
            <img src={logo} alt="Logo da empresa" />
            <h2>Cadastro de jogadores</h2>
            <h2>Bem-vindo!</h2>
            <button onClick={() => navigate('/cadastro')}>Cadastrar Usuário</button>
            <button onClick={() => navigate('/jogadores')}>Ver Usuários Cadastrados</button>
        </div>
    )
}

export default PaginaInicial