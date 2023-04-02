-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3307
-- Generation Time: Dec 08, 2022 at 10:52 AM
-- Server version: 10.4.25-MariaDB
-- PHP Version: 8.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `rumahsakit`
--

-- --------------------------------------------------------

--
-- Table structure for table `catatandokter`
--

CREATE TABLE `catatandokter` (
  `ID_Pasien` varchar(10) NOT NULL,
  `Gejala` varchar(100) NOT NULL,
  `Diagnosis` varchar(100) NOT NULL,
  `Obat` varchar(100) NOT NULL,
  `Jenis_Kamar` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `catatandokter`
--

INSERT INTO `catatandokter` (`ID_Pasien`, `Gejala`, `Diagnosis`, `Obat`, `Jenis_Kamar`) VALUES
('0002', 's', 't', 'u', 'Pilih Jenis Kamar'),
('123', 'gh', 'df', 'sdf', 'Umum'),
('pp', 'meriang', 'flu', 'tidur', 'Kelas I'),
('r', 'sa', 'sad', 'sad', 'Umum');

-- --------------------------------------------------------

--
-- Table structure for table `datadokter`
--

CREATE TABLE `datadokter` (
  `ID_Dokter` varchar(12) NOT NULL,
  `Nama` varchar(100) NOT NULL,
  `Usia` varchar(4) NOT NULL,
  `Jenis_Kelamin` varchar(30) NOT NULL,
  `Status_Hubungan` varchar(50) NOT NULL,
  `Alamat` varchar(100) NOT NULL,
  `Telp` varchar(15) NOT NULL,
  `Golongan_Darah` varchar(30) NOT NULL,
  `Tanggal_Bergabung` varchar(50) NOT NULL,
  `Spesialisasi` varchar(50) NOT NULL,
  `Waktu_Praktik` varchar(100) NOT NULL,
  `FotoDokter` blob NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `datadokter`
--

INSERT INTO `datadokter` (`ID_Dokter`, `Nama`, `Usia`, `Jenis_Kelamin`, `Status_Hubungan`, `Alamat`, `Telp`, `Golongan_Darah`, `Tanggal_Bergabung`, `Spesialisasi`, `Waktu_Praktik`, `FotoDokter`) VALUES
('221', 'Daniel Lokantara', 'dfvr', 'Laki-laki', 'Menikah', 'Gang Gladagan No. 67,Salatiga', '081254367756', 'O', '26 Januari 2032', 'Dokter Bedah', 'Selasa/07.00-10.00', 0x89504e470d0a1a0a0000000d4948445200),
('3454', 'Kalo', '30', 'Laki-laki', 'Belum Menikah', 'Salatiga', '0815483399', 'O', '5 Januari', 'Jantung', 'Selasa/09.00', 0x89504e470d0a1a0a0000000d4948445200000780000004380806000000e8d3);

-- --------------------------------------------------------

--
-- Table structure for table `datapasien`
--

CREATE TABLE `datapasien` (
  `ID_Pasien` varchar(10) NOT NULL,
  `Nama` varchar(200) NOT NULL,
  `Usia` varchar(4) NOT NULL,
  `Jenis_Kelamin` varchar(50) NOT NULL,
  `Status_Hubungan` varchar(50) NOT NULL,
  `Alamat` varchar(100) NOT NULL,
  `Telp` varchar(12) NOT NULL,
  `Golongan_Darah` varchar(20) NOT NULL,
  `Tanggal_Periksa` varchar(100) NOT NULL,
  `Riwayat_Penyakit` varchar(200) NOT NULL,
  `FotoPasien` blob NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `datapasien`
--

INSERT INTO `datapasien` (`ID_Pasien`, `Nama`, `Usia`, `Jenis_Kelamin`, `Status_Hubungan`, `Alamat`, `Telp`, `Golongan_Darah`, `Tanggal_Periksa`, `Riwayat_Penyakit`, `FotoPasien`) VALUES
('123', 'Lany', '21', 'Laki-laki', 'Belum Menikah', 'ss', 'sd', 'AB', 'sd', 's', 0x89504e470d0a1a0a0000000d4948445200),
('34256', 'Vanessa Wicaksono', '23', 'Perempuan', 'Belum Menikah', 'Jl.Hidup di depan no.34', '082133458796', 'A', '1 Maret 2021', 'Sakit Hati', 0x89504e470d0a1a0a0000000d4948445200000780000004380806000000e8d3),
('4366', 'Rafli Firmansyah', '16', 'Laki-laki', 'Belum Menikah', 'Jln. Aku padamu No. 34', '083455678643', 'O', '23 Februari 2021', 'Wazir', 0x89504e470d0a1a0a0000000d4948445200000780000004380806000000e8d3),
('r', 'abc', 'ef', 'Laki-laki', 'Belum Menikah', 'fes', 'fes', 'AB', 'dsf', 'ds', 0x89504e470d0a1a0a0000000d4948445200);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `catatandokter`
--
ALTER TABLE `catatandokter`
  ADD PRIMARY KEY (`ID_Pasien`);

--
-- Indexes for table `datadokter`
--
ALTER TABLE `datadokter`
  ADD PRIMARY KEY (`ID_Dokter`);

--
-- Indexes for table `datapasien`
--
ALTER TABLE `datapasien`
  ADD PRIMARY KEY (`ID_Pasien`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
