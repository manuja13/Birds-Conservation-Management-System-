-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 13, 2023 at 05:52 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bb`
--

-- --------------------------------------------------------

--
-- Table structure for table `bird`
--

CREATE TABLE `bird` (
  `scientific_name` varchar(255) NOT NULL,
  `wildlife_protected_area` varchar(100) NOT NULL,
  `colour` varchar(100) NOT NULL,
  `size` varchar(200) NOT NULL,
  `population` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `bird`
--

INSERT INTO `bird` (`scientific_name`, `wildlife_protected_area`, `colour`, `size`, `population`) VALUES
('Sri Lanka Blue Flycatcher', 'Horton Plains National Park', 'Blue, Black, White', '13-15 cm in length', 'Estimated to be in the thousands'),
('Sri Lanka Blue Magpie', 'Horton Plains National Park', 'Blue, Black, White', '42-47 cm in length', 'Estimated to be in the thousands'),
('Sri Lanka Brown-capped Babbler', 'Sinharaja Forest Reserve', 'Brown, Black, White', '16-18 cm in length', 'Estimated to be in the thousands'),
('Sri Lanka Bush Warbler', 'Knuckles Mountain Range', 'Brown, White', '13-14 cm in length', 'Estimated to be in the thousands'),
('Sri Lanka Crested Drongo', 'Udawalawe National Park', 'Black, White', '30-34 cm in length', 'Estimated to be in the thousands'),
('Sri Lanka Crimson-fronted Barbet', 'Knuckles Mountain Range', 'Green, Red, Yellow', '18-20 cm in length', 'Estimated to be in the thousands'),
('Sri Lanka Green Pigeon', 'Sinharaja Forest Reserve', 'Green, Yellow, Blue', '25-28 cm in length', 'Estimated to be in the tens of thousands'),
('Sri Lanka Grey Hornbill', 'Yala National Park', 'Grey, Black, White, Red', '50-60 cm in length', 'Estimated to be in the tens of thousands'),
('Sri Lanka Hanging Parrot', 'Bundala National Park', 'Green, Red, Yellow', '13-15 cm in length', 'Estimated to be in the thousands'),
('Sri Lanka Jungle Prinia ', 'Kalametiya Bird Sanctuary', 'Brown, White, Black', '11-12 cm in length', 'Estimated to be in the tens of thousands'),
('Sri Lanka Junglefowl', 'Sinharaja Forest Reserve', 'Red, Orange, Brown, Black', '55-75 cm in length', 'Estimated to be in the tens of thousands'),
('Sri Lanka Legges Flowerpecker', 'Sinharaja Forest Reserve', 'Green, Yellow, Black', '09-10 cm in length', 'Estimated to be in the thousands'),
('Sri Lanka Scimitar Babbler', 'Sinharaja Forest Reserve', 'Brown, Black, White', '20-23 cm in length', 'Estimated to be in the thousands'),
('Sri Lanka Spot-winged Thrush', 'Horton Plains National Park', 'Brown, Black, White', '23-24 cm in length', 'Estimated to be in the thousands'),
('Sri Lanka Spurfowl', 'Wilpattu National Park', 'Brown, Black, White', '33-36 cm in length', 'Estimated to be in the tens of thousands'),
('Sri Lanka Swallow ', 'Kumana National Park', 'Blue, Brown, White', '14-15 cm in length', 'Estimated to be in the thousands'),
('Sri Lanka White-eye', 'Kithulgala Forest Reserve', 'Green, White', '10-11 cm in length', 'Estimated to be in the tens of thousands'),
('Sri Lanka Wood Pigeon ', 'Horton Plains National Park', 'Grey, Green, Purple', '34-36 cm in length', 'Estimated to be less than 1000 individuals'),
('Sri Lanka Woodshrike', 'Horton Plains National Park', 'Grey, White,Black', '14-16 cm in length', 'Estimated to be in the thousands'),
('Sri Lanka Yellow-fronted Barbet ', 'Knuckles Mountain Range', 'Green, Yellow, Red', '20-22 cm in length', 'Estimated to be in the thousands');

-- --------------------------------------------------------

--
-- Table structure for table `birdwatcher`
--

CREATE TABLE `birdwatcher` (
  `nic` varchar(15) NOT NULL,
  `urn` int(10) NOT NULL,
  `Wildlife Protected Area` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `birdwatcher`
--

INSERT INTO `birdwatcher` (`nic`, `urn`, `Wildlife Protected Area`) VALUES
('123456789', 539973996, 'kandy'),
('15298752', 357489235, 'Galle'),
('200219502708', 470609929, 'Sinharaja'),
('200219502709', 801463256, 'Minneriya'),
('200219502710', 560539787, 'jaffna'),
('200219502711', 806983820, 'Kandy'),
('22222222', 394801884, 'colombo'),
('76845924', 565373593, 'Jaffna'),
('manuja', 123, '');

-- --------------------------------------------------------

--
-- Table structure for table `departmentofficer`
--

CREATE TABLE `departmentofficer` (
  `nic` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `departmentofficer`
--

INSERT INTO `departmentofficer` (`nic`, `password`) VALUES
('manuja', '123');

-- --------------------------------------------------------

--
-- Table structure for table `directorgeneral`
--

CREATE TABLE `directorgeneral` (
  `nic` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `directorgeneral`
--

INSERT INTO `directorgeneral` (`nic`, `password`) VALUES
('manuja', '123');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bird`
--
ALTER TABLE `bird`
  ADD PRIMARY KEY (`scientific_name`);

--
-- Indexes for table `birdwatcher`
--
ALTER TABLE `birdwatcher`
  ADD PRIMARY KEY (`nic`);

--
-- Indexes for table `departmentofficer`
--
ALTER TABLE `departmentofficer`
  ADD PRIMARY KEY (`nic`);

--
-- Indexes for table `directorgeneral`
--
ALTER TABLE `directorgeneral`
  ADD PRIMARY KEY (`nic`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
