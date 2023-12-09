package com.alphas.movies;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

import java.io.IOException;
import java.util.List;
import java.util.logging.Filter;

@Component
public class FilterChainLogger implements Filter {

    private final FilterComparator comparator;

    public FilterChainLogger(FilterComparator comparator) {
        this.comparator = comparator;
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        List<Filter> filters = comparator.getChain(request.getServletContext(), "springSecurityFilterChain", chain);
        for (Filter filter : filters) {
            System.out.println(filter.getClass().getName());
        }
        chain.doFilter(request, response);
    }
}
