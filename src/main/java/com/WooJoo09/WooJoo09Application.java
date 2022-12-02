package com.WooJoo09;

import com.WooJoo09.entity.Member;
import com.WooJoo09.repository.MemberRepository;
import com.WooJoo09.service.MemberService;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@SpringBootApplication
public class WooJoo09Application {

	public static void main(String[] args) {SpringApplication.run(WooJoo09Application.class, args);


	}

}
