require 'rubygems'
require 'selenium-webdriver'

proxy = Selenium::WebDriver::Proxy.new(:http => "gate.decodo.com:7000")

driver = Selenium::WebDriver.for :chrome, :proxy => proxy
driver.navigate.to "http://ip.decodo.com/"
element = driver.find_element(:css, 'body')

puts element.text

driver.quit
