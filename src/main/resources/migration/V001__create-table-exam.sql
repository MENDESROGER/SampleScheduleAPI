CREATE TABLE `exam` (
  `candidate_id` bigint(20) NOT NULL,
  `availability_id` bigint(20) NOT NULL,
  `datescheduling` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON
  UPDATE
    CURRENT_TIMESTAMP,
    `typecertification` varchar(20) NOT NULL,
    PRIMARY KEY (`candidate_id`, `availability_id`)
) ENGINE = InnoDB DEFAULT CHARSET = latin1