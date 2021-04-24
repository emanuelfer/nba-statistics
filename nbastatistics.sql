-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 25-Abr-2021 às 00:22
-- Versão do servidor: 10.4.17-MariaDB
-- versão do PHP: 8.0.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `nbastatistics`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `equipe`
--

CREATE TABLE `equipe` (
  `id` int(11) NOT NULL,
  `franquia` varchar(60) NOT NULL,
  `cidade` varchar(60) NOT NULL,
  `conferencia` varchar(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `equipe`
--

INSERT INTO `equipe` (`id`, `franquia`, `cidade`, `conferencia`) VALUES
(1, 'Cleveland', 'Cleveland', 'Sudeste'),
(2, 'Los Angeles Laker', 'Los Angeles', 'Norte '),
(3, 'Houston Rockets', 'Houston', 'Nordese'),
(4, 'San Antonio Spurs', 'San Antonio', 'Centro-oeste'),
(5, 'Golden State Warriors', 'San Francisc', 'Sudeste'),
(6, 'Los Angeles Clippers', 'Los Angeles', 'Sudeste'),
(7, 'Miami Heat', 'Miami', 'Sudeste'),
(8, 'Chicago Bulls', 'Miami', 'Sudeste');

-- --------------------------------------------------------

--
-- Estrutura da tabela `estatistica_jogador`
--

CREATE TABLE `estatistica_jogador` (
  `id` int(11) NOT NULL,
  `fk_jogador` int(11) NOT NULL,
  `fk_partida` int(11) NOT NULL,
  `pontos` int(11) NOT NULL,
  `rebotes` int(11) NOT NULL,
  `assistencias` int(11) NOT NULL,
  `roubadas` int(11) NOT NULL,
  `tocos` int(11) NOT NULL,
  `turnovers` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `estatistica_jogador`
--

INSERT INTO `estatistica_jogador` (`id`, `fk_jogador`, `fk_partida`, `pontos`, `rebotes`, `assistencias`, `roubadas`, `tocos`, `turnovers`) VALUES
(1, 2, 3, 50, 20, 10, 7, 5, 2),
(2, 4, 2, 30, 10, 10, 10, 20, 0),
(3, 2, 4, 20, 10, 7, 8, 10, 1),
(4, 5, 5, 10, 5, 20, 10, 7, 1);

-- --------------------------------------------------------

--
-- Estrutura da tabela `jogador`
--

CREATE TABLE `jogador` (
  `id` int(11) NOT NULL,
  `fk_equipe` int(11) NOT NULL,
  `nome` varchar(60) NOT NULL,
  `cpf` varchar(11) NOT NULL,
  `posicao` varchar(20) NOT NULL,
  `idade` int(11) NOT NULL,
  `altura` float NOT NULL,
  `peso` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `jogador`
--

INSERT INTO `jogador` (`id`, `fk_equipe`, `nome`, `cpf`, `posicao`, `idade`, `altura`, `peso`) VALUES
(1, 1, 'Lebron James', '11111111111', 'Ala Pivô', 36, 210, 110),
(2, 5, 'Emanuel Ferreira', '22222222222', 'Armador', 20, 190, 90),
(3, 1, 'Marcelinho Uertas', '55555555555', 'Armador', 30, 190, 90),
(4, 4, 'Tim Ducan', '99999999999', 'Armador', 40, 210, 110),
(5, 6, 'Chris Paul', '55555555555', 'Armador', 36, 183, 90),
(7, 6, 'Geraldo Braz', '99999999999', 'Ala Armador', 35, 190, 80),
(8, 6, 'Geraldo Braz', '99999999999', 'Ala Armador', 35, 190, 80);

-- --------------------------------------------------------

--
-- Estrutura da tabela `partida`
--

CREATE TABLE `partida` (
  `id` int(11) NOT NULL,
  `fk_equipe1` int(11) NOT NULL,
  `fk_equipe2` int(11) NOT NULL,
  `pontos_equipe1` int(11) NOT NULL,
  `pontos_equipe2` int(11) NOT NULL,
  `local` varchar(100) DEFAULT NULL,
  `data` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Extraindo dados da tabela `partida`
--

INSERT INTO `partida` (`id`, `fk_equipe1`, `fk_equipe2`, `pontos_equipe1`, `pontos_equipe2`, `local`, `data`) VALUES
(2, 4, 5, 100, 120, 'Cidade Operária', '2021-04-04 19:51:40'),
(3, 5, 2, 120, 119, 'San Francisc', '2021-04-09 21:34:31'),
(4, 5, 3, 130, 120, 'EcoSport', '2021-04-16 15:01:10'),
(5, 2, 6, 110, 150, 'Los Angeles ', '2021-04-23 17:56:52'),
(6, 1, 2, 110, 111, 'Local teste', '2021-04-24 00:00:00');

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `equipe`
--
ALTER TABLE `equipe`
  ADD PRIMARY KEY (`id`);

--
-- Índices para tabela `estatistica_jogador`
--
ALTER TABLE `estatistica_jogador`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_jogador` (`fk_jogador`),
  ADD KEY `fk_partida` (`fk_partida`);

--
-- Índices para tabela `jogador`
--
ALTER TABLE `jogador`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_equipe` (`fk_equipe`);

--
-- Índices para tabela `partida`
--
ALTER TABLE `partida`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_equipe1` (`fk_equipe1`),
  ADD KEY `fk_equipe2` (`fk_equipe2`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `equipe`
--
ALTER TABLE `equipe`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de tabela `estatistica_jogador`
--
ALTER TABLE `estatistica_jogador`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de tabela `jogador`
--
ALTER TABLE `jogador`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de tabela `partida`
--
ALTER TABLE `partida`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- Restrições para despejos de tabelas
--

--
-- Limitadores para a tabela `estatistica_jogador`
--
ALTER TABLE `estatistica_jogador`
  ADD CONSTRAINT `estatistica_jogador_ibfk_1` FOREIGN KEY (`fk_jogador`) REFERENCES `jogador` (`id`),
  ADD CONSTRAINT `estatistica_jogador_ibfk_2` FOREIGN KEY (`fk_partida`) REFERENCES `partida` (`id`);

--
-- Limitadores para a tabela `jogador`
--
ALTER TABLE `jogador`
  ADD CONSTRAINT `jogador_ibfk_1` FOREIGN KEY (`fk_equipe`) REFERENCES `equipe` (`id`);

--
-- Limitadores para a tabela `partida`
--
ALTER TABLE `partida`
  ADD CONSTRAINT `partida_ibfk_1` FOREIGN KEY (`fk_equipe1`) REFERENCES `equipe` (`id`),
  ADD CONSTRAINT `partida_ibfk_2` FOREIGN KEY (`fk_equipe2`) REFERENCES `equipe` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
