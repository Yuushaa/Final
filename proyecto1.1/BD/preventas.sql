-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 06-06-2016 a las 19:11:56
-- Versión del servidor: 5.7.12-log
-- Versión de PHP: 5.6.20

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `listafin`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `preventas`
--

CREATE TABLE `preventas` (
  `idPreventas` int(11) NOT NULL,
  `NombreP` varchar(45) NOT NULL,
  `Ruta` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `preventas`
--

INSERT INTO `preventas` (`idPreventas`, `NombreP`, `Ruta`) VALUES
(1, 'Juan', 1101),
(2, 'CholoLuis', 1102),
(5, 'Edgarito', 1109),
(9, 'Pinshishuy', 1122);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `preventas`
--
ALTER TABLE `preventas`
  ADD PRIMARY KEY (`idPreventas`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `preventas`
--
ALTER TABLE `preventas`
  MODIFY `idPreventas` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
