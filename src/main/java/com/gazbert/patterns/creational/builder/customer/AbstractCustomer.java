/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2016 Gareth Jon Lynch
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
 * the Software, and to permit persons to whom the Software is furnished to do so,
 * subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.gazbert.patterns.creational.builder.customer;

import com.gazbert.patterns.creational.builder.Address;
import com.gazbert.patterns.creational.builder.account.Account;

/**
 * Abstract Customer holds all the bits n pieces common to all Customer types.
 *
 * @author gazbert
 */
public abstract class AbstractCustomer implements Customer {

    /**
     * Reference to the Account we have built for this Customer
     */
    private Account account;

    /**
     * Contact details for Customer
     */
    private Address address;


    public AbstractCustomer(Account account) {
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }

    public String toString() {
        return getClass().getSimpleName() + " Account:" + account;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
