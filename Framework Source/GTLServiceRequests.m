/* This file was generated by the ServiceGenerator.
 * The ServiceGenerator is Copyright (c) 2016 Google Inc.
 */

//
//  GTLServiceRequests.m
//

// ----------------------------------------------------------------------------
// NOTE: This file is generated from Google APIs Discovery Service.
// Service:
//   requests/v1
// Description:
//   Square 1 API
// Classes:
//   GTLServiceRequests (0 custom class methods, 0 custom properties)

#import "GTLRequests.h"

@implementation GTLServiceRequests

#if DEBUG
// Method compiled in debug builds just to check that all the needed support
// classes are present at link time.
+ (NSArray *)checkClasses {
  NSArray *classes = @[
    [GTLQueryRequests class],
    [GTLRequestsIacceptUser class],
    [GTLRequestsIlist class],
    [GTLRequestsIrejectUser class]
  ];
  return classes;
}
#endif  // DEBUG

- (instancetype)init {
  self = [super init];
  if (self) {
    // Version from discovery.
    self.apiVersion = @"v1";

    // From discovery.  Where to send JSON-RPC.
    // Turn off prettyPrint for this service to save bandwidth (especially on
    // mobile). The fetcher logging will pretty print.
    self.rpcURL = [NSURL URLWithString:@"/_ah/api/rpc?prettyPrint=false"];
  }
  return self;
}

@end